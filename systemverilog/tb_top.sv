module tb_top();
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
    initial begin
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
