Simplies runner for SeqWare 
---------------------------

THIS SOFTWARE IS SUPER BETA AND A PROOF OF CONCEPT!

This is a tool for reducing the overhead of wrapping tools inside SeqWare workflows. It consists
of two main components. One is a set of tools to make it easier to get started with SeqWare, the
second is a Groovy based system for defining workflows based on the same conventions as SeqWare's 
workflow system.  This language enables you to either run the workflow in a local context with 
a logfile or to deploy the workflow to a SeqWare environment.

QUICK START
-----------

export PATH=$HOME/Downloads/groovy-2.4.0/bin/:${PATH}

# Local: Run src/example.groovy using local execution environment
  ./run_local.sh


# Seqware: Run src/example.groovy using the SeqWare environmetn.
  # Only run once
  ./seqware_setup.sh
  ./create_examples.sh
  ./run_seqware.sh
