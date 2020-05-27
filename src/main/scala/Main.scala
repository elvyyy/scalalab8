import models.{Organizer, Task}

object Main {

  def main(args: Array[String]): Unit = {
    val organizer = Organizer(Vector.empty[Task])

    val o1 = organizer.add(Task("a2", "d2", false)).add(Task("a3", "d3", false)).add(Task("a4", "d4", false))
      .add(Task("a5", "d5", true)).add(Task("a6", "d6", false))
      .add(Task("a7", "d7", true)).add(Task("a8", "d8", false))
    o1.print

    val toggled = o1.toggle(6)
    toggled.print

    val uncompleted = toggled.uncompleted
    uncompleted.print
  }

}
