# Image loading library for Android (Glide - Coil - Picasso)

***
### Description about libraries:

## 1- Glide
A quick and effective open-source media management and image loading framework for Android, Glide combines resource pooling, memory and disc caching, and media decoding into a user-friendly interface. Additionally, it allows for the retrieval, decoding, and display of video stills, pictures, and animated GIFs.

## 2- Coil
These days, The Coil is gaining more and more popularity. Why is it growing more common? due to the fact that Kotlin was used in its creation. Coil handles Kotlin Coroutines and OkHttp and is fast, lightweight, and modern. Coil is the first open source image loading library written in Kotlin for android, so keep that in mind.

## 3- Picasso
a strong Android image downloader and cache library tool. One of the first libraries in this field to be founded. On the one hand, this raises the risk in my opinion, that new technologies won't be supported because of the outdated source.
***

### Measure the performance of these libraries:

The point is to measure and give you a rough idea of Coils Glide and Picasso performance and when to use each. So, we'll compare how quickly files are downloaded from the network and loaded from the cache.


When the cache is empty and the image is being downloaded from the server, that is the scenario we will start with:

## 1- Glide

The time for Glide per photo with an empty cache is shown in the table below. Take note that these times represent the average of ten tries:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/g1.png" height="210" width="360" ></p>

The following table displays the average loading time as well as the time required to load the entire list of images:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/g2.png" height="300" width="240" ></p>

## 2- Coil

Coil's turn is now:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/c1.png" height="210" width="360" ></p>

Here is a list of all the pictures:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/c2.png" height="600" width="400" ></p>

## 3- Picasso

Similar to Picasso:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/p1.png" height="210" width="360" ></p>

The duration for the entire set of images:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/p2.png" height="600" width="400" ></p>



