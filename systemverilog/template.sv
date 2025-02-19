typedef enum logic[1:0]{
    STATE_IDLE, STATE_A, STATE_B
} state_t;
state_t state;

typedef struct packed {
    logic [31:0] din,
    logic [7:0] addr,
    logic [3:0] wen
} ram;

module template #(
    parameter P1 = 50_000_000,
    parameter P2 = 32'h4000_0000,
)(
    input clk,
    input rst,
    input ram in,
    output out
);

    // Components

    localparam PARAM = 7'b0110011;
    logic [P1-1:0] w;
    logic [P1-1:0][P2-1:0] memory;

    MOD #(.N(P1), .M(0)) mod(.in(out), .out(in));
    
    // Datapath

    always_ff @(posedge clk) begin
        case (state)
            STATE_IDLE:
                state <= STATE_A;
            STATE_A:
                state <= STATE_B;
            STATE_B:
                state <= STATE_IDLE;
        endcase
    end
    
endmodule
