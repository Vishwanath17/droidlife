package org.jtb.droidlife;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

import android.content.res.AssetManager;
import android.util.Log;

public abstract class FileSeedSource extends SeedSource {	
	protected String path;
	
	public FileSeedSource(String path) {
		this.path = path;
	}
	
	public abstract ArrayList<Seeder> getSeeders();
}