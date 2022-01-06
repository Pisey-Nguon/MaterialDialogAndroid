# MaterialDialog
[![](https://jitpack.io/v/Pisey-Nguon/MaterialDialog.svg)](https://jitpack.io/#Pisey-Nguon/MaterialDialog)

How to

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

if your gradle version less than 7.0, add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' } //Add this line
		}
	}
  
if your gradle version from 7.0, add it in your root settings.gradle at the end of repositories:

    dependencyResolutionManagement {
	    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	    repositories {
	        google()
	        mavenCentral()
	        jcenter() // Warning: this repository is going to shut down soon
	        maven { url 'https://jitpack.io' } //Add this line
	    }
    }

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Pisey-Nguon:MaterialDialog:1.0.0'
	}
