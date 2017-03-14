package demo

case class Sample(num: Int, text: String)

object Sample {

  def seq(): Seq[Option[Sample]] = {
    (1 to 100).map { n =>
      if (n % 2 == 0) Some(Sample(n, n.toString))
      else None
    }
  }

}
