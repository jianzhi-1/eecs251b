# EECS 251B
### Advanced Digital Integrated Circuits and Systems
UC Berkeley Spring 2025, taught by Dr Richard Dorrance and Professor Borivoje Nikolic

### Lab 1 Learning Points
- First, assign all out ports (some reasonable temporary value), so that you don't forget later on.
- log2Ceil(x + 1): don't do just log2Ceil(x), will mess up equality checks later on...
- Chisel print debug statements: `printf(s"numWords = $numWords, dataWidth = $dataWidth, patterns = $patterns\n")`

### Lab 3 Learning Points
- Always SSH with -X flag.
```
ssh -AXY eecs251b-***@eda-*.eecs.berkeley.edu
source ~/.bashrc
cd /scratch/$USER/sp25-chipyard-***/
source env.sh
```

### Lab 4 Learning Points
- Remember to `source ~/.bashrc` to activate the conda environment...

### Lab 5 Learning Points
- In VSCode `settings.json`, add `"search.useIgnoreFiles": false` to also search files hidden by `.gitignore`.

### Project Learning Points
- Blackboxes won't be synthesised (synthesis is verilog -> netlist, so if the verilog is a stub, there won't be a netlist)

### Acronyms
- FIRRTL: Flexible Intermediate Representation for RTL, similar concept to intermediate language in compilers.
- DRC: Design Rule Checking
- P&R: Place and Route
- LVS: Layout vs Schematic
