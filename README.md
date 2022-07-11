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
	        implementation 'com.github.Pisey-Nguon:MaterialDialog:1.0.1'
	}
	

Step 3. Implememt code

## Show Loading with no title

![photo_2022-01-11 08 55 16](https://user-images.githubusercontent.com/47247206/148868984-e4876822-770a-41b2-93ee-e09935ac0938.jpeg)

    fun openLoadingDialogNoTitle(){
	    val materialLoading = MaterialLoadingDialog(this)  
        materialLoading  
		    .setTitleColor(R.color.black)  
            .setProgressBarColor(R.color.purple_200)  
            .setCancelable(true)  
            .setOnDismissListener {  
		      Log.d(TAG, "openLoadingDialog: Dismissed")  
            }  
		    .show()  
    }


## Show loading with title
![photo_2022-01-11 08 55 10](https://user-images.githubusercontent.com/47247206/148869054-6027ebbd-fab6-482a-9bc4-e81fe74a23c2.jpeg)


    fun openLoadingDialogWithTitle(){ 
        val materialLoading = MaterialLoadingDialog(this)  
        materialLoading  
		    .setTitle("Loading")  
            .setTitleColor(R.color.black)  
            .setProgressBarColor(R.color.purple_200)  
            .setCancelable(true)  
            .setOnDismissListener {  
			     Log.d(TAG, "openLoadingDialog: Dismissed")  
            }  
		    .show()  
    }

## Show alert dialog
![photo_2022-01-11 08 55 13](https://user-images.githubusercontent.com/47247206/148869068-e4512ffd-bae5-4ff3-b9ba-8c92d259cca5.jpeg)


    fun openAlertDialog(){  
        val materialLoading = MaterialLoadingDialog(this) 
        materialAlertDialog  
		    .setTitle("This is my title")  
            .setMessage("This is my message")  
            .setCancelable(true)  
            .setIcon(ContextCompat.getDrawable(this,R.drawable.ic_alert)!!)  
            .setOnDismissListener {  
			      Log.d(TAG, "openAlertDialog: Dismissed")  
            }  
		    .setOnButtonPositiveListener("Yes"){  
			      Log.d(TAG, "openAlertDialog: Clicked Yes")  
            }  
		    .setOnButtonNegativeListener("No"){  
			      Log.d(TAG, "openAlertDialog: Clicked No")  
            }  
		    .show()  
    }

