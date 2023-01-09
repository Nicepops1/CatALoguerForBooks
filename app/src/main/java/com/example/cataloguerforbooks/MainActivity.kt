package com.example.cataloguerforbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToLibrary(view: View) {
        val libraryIntent = Intent( this, LibraryActivity :: class.java)
        startActivity(libraryIntent)
    }
    fun goToExport(view: View) {
        val exportIntent = Intent(this, ExportActivity :: class.java)
        startActivity(exportIntent)
    }
    fun goToCataloguer(view: View) {
        val cataloguerIntent = Intent(this, CataloguerActivity :: class.java)
        startActivity(cataloguerIntent)
    }
    fun goToScan(view: View) {
        val scanIntent = Intent(this, ScanActivity :: class.java)
        startActivity(scanIntent)
    }

}