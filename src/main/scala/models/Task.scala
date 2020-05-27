package models

case class Task(title: String, description: String, completed: Boolean) {
  def toggle = Task(title, description, !completed)

  override def toString: String =
    "Task: " + title + ". Desc: " + description + ". Completed: " + completed
}
