package pt.indoortrackingapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import pt.indoortrackingapp.R
import pt.indoortrackingapp.ui.fragments.DevicesFragment
import pt.indoortrackingapp.ui.fragments.HistoryFragment
import pt.indoortrackingapp.ui.fragments.MapFragment
import pt.indoortrackingapp.ui.fragments.ProfileFragment

class DashBoardActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        val mapFragment = MapFragment()
        val devicesFragment = DevicesFragment()
        val historyFragment = HistoryFragment()
        val profileFragment = ProfileFragment()

        bottomNavigation = findViewById(R.id.bottomNavigation)

        makeCurrentFragment(mapFragment)

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menu_map -> makeCurrentFragment(mapFragment)
                R.id.menu_devices -> makeCurrentFragment(devicesFragment)
                R.id.menu_history -> makeCurrentFragment(historyFragment)
                R.id.menu_profile -> makeCurrentFragment(profileFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()

    }
}