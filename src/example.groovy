// Real program
parent_w = new Workflow("Parent workflow")
w = new Workflow("My workflow")

w.register_directory("my_outputs")
w.run("biotool " + w.inputs[0])
w.register_file("output.txt", "text/plain", true)
w.add_parent(parent_w)
