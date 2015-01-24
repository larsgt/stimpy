// Implementation of workflow system using Seqware
class Workflow {
  def inputs = [1,2,3]
  Workflow(name) { println("Starting Seqware workflow...") }

  def add_parent(w) {}
  def register_directory(dir) {}
  def run(command) { println(command) }
  def register_file(command, mime, something) {}

}
