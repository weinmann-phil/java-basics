#!/bin/bash
#
# Script to compile and run project

function compile_and_run_project {
  mvn clean package
  java -jar target/*.jar
}

function main {
  compile_and_run_project
}

main
