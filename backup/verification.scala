
class DeviceHead(dataWidth: Int) extends Module {
    val io = IO(new Bundle{
        val clk = Input(Clock())

        // interface with ULPI
        val data_out = Output(UInt(dataWidth.W))
        val data_in = Input(UInt(dataWidth.W))
        val dir = Input(Bool())
        val stp = Output(Bool())
        val nxt = Input(Bool())
    })

    val dir_reg = RegInit(false.B)
    val nxt_reg = RegInit(false.B)
    val data_in_reg = RegInit(false.B)
}

class TXHead(dataWidth: Int) extends Module {
    val io = IO(new Bundle{
        val clk = Input(Clock())

        // interface with TX Logic
        val rpu = Input(Bool())

        val vpo = Input(Bool())
        val vno = Input(Bool())
        val oeb = Input(Bool())

        val hs_data     = Input(Bool())
        val hs_drive_en = Input(Bool())
        val hs_cs_en    = Input(Bool())
    })
}

class RXHead(dataWidth: Int) extends Module {
    val io = IO(new Bundle{
        val clk = Input(Clock())

        // interface with TX Logic
        val rpu = Input(Bool())

        val vpo = Input(Bool())
        val vno = Input(Bool())
        val oeb = Input(Bool())

        val hs_data     = Input(Bool())
        val hs_drive_en = Input(Bool())
        val hs_cs_en    = Input(Bool())
    })
}

class TXVerifier(dataWidth: Int, patterns: Seq[Pattern.Type]) extends Module {
    val io = IO(new Bundle{
        val clk = Input(Clock())

        // interface with ULPI
        val data_out = Output(UInt(dataWidth.W))
        //val data_in = Input(UInt(dataWidth.W))
        //val dir = Input(Bool())
        val stp = Output(Bool())
        //val nxt = Input(Bool())

        // interface for verification
        val data = Input(UInt(dataWidth.W)) // MMIO
        val done = Output(Bool())
        val fail = Output(Bool())
    })

    // 0. Initialise output
    io.done := false.B
    io.fail := false.B

    // 1. Define useful quantities
    val length = patterns.length.U
    val done_reg = RegInit(false.B)
    val fail_reg = RegInit(false.B)

    // 2. Logic

    patterns.zipWithIndex.foreach {
        case (pattern, idx) => {
            when (...) {
                pattern match {
                    case Pattern.W0 => {

                    }

                    case Pattern.W1 => {

                    }

                    case Pattern.R0 => {

                    }

                    case Pattern.R1 => {

                    }
                }
            }
        }
    }

    // 3. Finalise output
    done_reg := done_reg || true
    fail_reg := fail_reg || true

    io.done := done_reg
    io.fail := fail_reg
}

class RXVerifier(dataWidth: Int, patterns: Seq[Pattern.Type]) extends Module {
    val io = IO(new Bundle{
        val clk = Input(Clock())

        // interface with ULPI
        val data_out = Output(UInt(dataWidth.W))
        val data_in = Input(UInt(dataWidth.W))
        val dir = Input(Bool())
        val stp = Output(Bool())
        val nxt = Input(Bool())

        // interface for verification
        val data = Input(UInt(dataWidth.W)) // MMIO
        val done = Output(Bool())
        val fail = Output(Bool())
    })

    // 0. Initialise output
    io.done := false.B
    io.fail := false.B

    // 1. Define useful quantities
    val length = patterns.length.U
    val done_reg = RegInit(false.B)
    val fail_reg = RegInit(false.B)

    // 2. Logic

    patterns.zipWithIndex.foreach {
        case (pattern, idx) => {
            when (...) {
                pattern match {
                    case Pattern.W0 => {

                    }

                    case Pattern.W1 => {

                    }

                    case Pattern.R0 => {

                    }

                    case Pattern.R1 => {

                    }
                }
            }
        }
    }

    // 3. Finalise output
    done_reg := done_reg || true
    fail_reg := fail_reg || true

    io.done := done_reg
    io.fail := fail_reg
}
