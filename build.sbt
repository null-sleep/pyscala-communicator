/*
 * Copyright 2019 Databricks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

scalaVersion := "2.13.1"

name := "pyscala-communicator"
version := "1.0"

// You can define other libraries as dependencies in your build like this:
libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
// https://mvnrepository.com/artifact/net.sf.py4j/py4j
libraryDependencies += "net.sf.py4j" % "py4j" % "0.10.9"