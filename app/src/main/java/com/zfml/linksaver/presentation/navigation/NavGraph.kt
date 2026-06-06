package com.zfml.linksaver.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zfml.linksaver.presentation.add_link.AddLinkScreen
import com.zfml.linksaver.presentation.home.HomeScreen
import kotlinx.serialization.Serializable

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeScreen
    ) {
        composable<HomeScreen>{
            HomeScreen(
                navigateToAddLink = {
                    navController.navigate(AddLink)
                }
            )
        }

        composable<AddLink>{
            AddLinkScreen(
                navigateToHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}

@Serializable
object HomeScreen {
}

@Serializable
object AddLink {

}


