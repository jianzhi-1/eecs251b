class Packet;
    bit [31:0] addr;
    bit [31:0] payload [4];

    function new (bit [31:0] addr);
        this.addr = addr;
        this.payload = `{0, 0, 0, 0};
    endfunction
endclass

class RandomPacket;
    rand bit [7:0] min, max;
    constraint range {
        0 < min; max < 128; min < max;
    }
    extern constraint extra;
endclass

constraint RandomPacket::extra { min > 5; };

module verification_top();
    reg clk;
    reg resetn;
    reg d;
    wire q;

    // 0. Instantiate device under test
    d_ff dut(
        .clk(clk),
        .resetn(resetn),
        .d(d),
        .q(q)
    );

    // 1. Create clock
    always #10 clk <= ~clk;

    // 2. Simulation and verification
    int arr[];
    initial begin
        arr = new[2];
        arr = `{12, 10};
        $display("%p, %0d", arr, arr.size());
        arr = new[arr.size()+1](arr);
        arr[2] = 4;
        arr.delete();

        pkt = new Packet(32'd4);
        $display(pkt.payload);
        
        cls = new();
        cls.randomize() with { min == 10; } // utilises external constraint
        
        resetn <= 0;
        d <= 0;

        #10 resetn <= 1;
        #5 d <= 1;
        #8 d <= 0;
        #2 d <= 1;
        #10 d <= 0;
        $display("[%0t] PASS", $time);
        $finish();
    end
endmodule
