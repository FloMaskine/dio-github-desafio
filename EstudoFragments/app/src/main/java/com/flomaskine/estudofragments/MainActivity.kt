package com.flomaskine.estudofragments

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {

//    private lateinit var buttonHome: Button
//    private lateinit var buttonConsoles: Button
//    private lateinit var buttonGames: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var consoleFragment: ConsoleFragment
    private lateinit var gameFragment: GameFragment

    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        buttonHome = findViewById(R.id.button_home)
//        buttonHome.setOnClickListener(this)
//
//        buttonConsoles = findViewById(R.id.button_consoles)
//        buttonConsoles.setOnClickListener(this)
//
//        buttonGames = findViewById(R.id.button_games)
//        buttonGames.setOnClickListener(this)


        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gameFragment = GameFragment()

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)


        setFragment(homeFragment)

    }

    private fun setFragment(fragment: Fragment){
        val fragmentTrasaction = supportFragmentManager.beginTransaction()
        fragmentTrasaction.replace(R.id.frame_fragments, fragment)
        fragmentTrasaction.commit()


    }

    override fun onClick(v: View) {
//        when (v.id){
//            R.id.button_home -> {
//                setFragment(homeFragment)
//            }
//            R.id.button_games -> {
//                setFragment(gameFragment)
//            }
//            R.id.button_consoles -> {
//                setFragment(consoleFragment)
//            }
//        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> {
                setFragment(homeFragment)
            }
            R.id.menu_game -> {
                setFragment(gameFragment)
            }
            R.id.menu_console -> {
                setFragment(consoleFragment)
            }
        }
        return true
    }


}