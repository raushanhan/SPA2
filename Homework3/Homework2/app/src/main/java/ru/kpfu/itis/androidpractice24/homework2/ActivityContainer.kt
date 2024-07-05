package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import ru.kpfu.itis.androidpractice24.homework2.databinding.ActivityContainerBinding


class ActivityContainer : AppCompatActivity() {

    private var binding: ActivityContainerBinding? = null
    private var controller: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContainerBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        controller = (supportFragmentManager.findFragmentById(R.id.container)
                as? NavHostFragment)?.navController

        controller?.let { controller ->
            binding?.bottomNavigation?.setupWithNavController(controller)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        controller?.navigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}