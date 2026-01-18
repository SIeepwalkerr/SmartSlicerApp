package com.example.smartslicerapp

sealed class Screen(val route: String) {
    object Main : Screen("main")
    object CubeSlicer : Screen("cube_slicer")
    object BladeSlicer : Screen("blade_slicer")
    object RecipeSelection : Screen("recipe_selection")
    object PortionSettings : Screen("portion_settings/{recipeName}") {
        fun createRoute(recipeName: String) = "portion_settings/$recipeName"
    }
    object WeighingMode : Screen("weighing_mode/{recipeName}/{portions}") {
        fun createRoute(recipeName: String, portions: Int) = "weighing_mode/$recipeName/$portions"
    }
    object Settings : Screen("settings")
}