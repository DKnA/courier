organization := "dka"

name := "courier"

version := "0.2.1"

description := "deliver electronic mail with scala"

libraryDependencies ++= Seq(
  "javax.mail"        % "mail"        % "1.4.7",
  "javax.activation"  % "activation"  % "1.1.1"
)

scalacOptions ++= Seq(
  "-feature"
)

licenses := Seq(
  ("MIT", url(s"https://github.com/DKnA/${name.value}/blob/${version.value}/LICENSE")))

homepage := Some(url(s"https://github.com/DKnA/${name.value}/#readme"))

crossScalaVersions := Seq("2.10.4", "2.11.8")

scalaVersion := crossScalaVersions.value.last

bintrayPackageLabels := Seq("email", "mail", "javamail")

bintrayOrganization := Some("kallebertell")

bintrayRepository := "dkaio"

pomExtra := (
  <scm>
    <url>git@github.com:DKnA/courier.git</url>
    <connection>scm:git:git@github.com:DKnA/courier.git</connection>
  </scm>
  <developers>
    <developer>
      <id>dka</id>
      <name>Dunning, Kruger &amp; Associates</name>
      <url>https://github.com/DKnA</url>
    </developer>
  </developers>)
