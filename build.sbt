import org.scalajs.linker.interface.ModuleInitializer

scalaJSModuleInitializers in Compile += {
  ModuleInitializer.mainMethod("dp.AppB", "main").withModuleID("b")
}

enablePlugins(ScalaJSBundlerPlugin)

name := "module_splitting"

scalaVersion := "2.13.2"
scalacOptions += "-Ymacro-annotations"