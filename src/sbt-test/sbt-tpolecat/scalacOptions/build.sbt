val scala2Versions = Seq(
  "2.10.7",
  "2.11.12",
  "2.12.10",
  "2.13.1"
)

crossScalaVersions := (CrossVersion.partialVersion(sbtVersion.value) match {
  case Some((1, _)) => scala2Versions :+ "0.21.0" // the dotty plugin isn't available for sbt 0.13.x, so we can only add the dotty version here
  case _ => scala2Versions
})
