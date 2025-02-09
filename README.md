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
ssh -X eecs251b-***@eda-*.eecs.berkeley.edu
source ~/.bashrc
cd /scratch/$USER/sp25-chipyard-***/
source env.sh
```

### Acronyms
- FIRRTL: Flexible Intermediate Representation for RTL, similar concept to intermediate language in compilers.
- DRC: Design Rule Checking
