class UtmiBlackBox(dataWidth: Int) extends BlackBox with HasBlackBoxResource {
    // require(dataWidth == 8 || dataWidth == 16, "UTMI data width must be 8 or 16 bits")
    val io = IO(new Bundle {
        val clk = Input(Clock())

        // USB 2.0 Transceiver Macrocell Interface (UTMI) Specification
        // Intel, 2001, page 17-18

        /* transmit interface */
        val tx_valid = Input(Bool())
        // val tx_validh = Input(Bool())
        val tx_ready = Output(Bool())
        val tx_data = Input(UInt(dataWidth.W)) // DataIn [0-7], [8-15]
        
        /* receive interface */
        val rx_valid = Output(Bool())
        // val rx_validh = Output(Bool())
        // val rx_active = Output(Bool())
        // val rx_error = Output(Bool())
        val rx_data = Output(UInt(dataWidth.W)) // DataOut [0-7], [8-15]
    })
    // TODO: Point to the verilog source file
}
