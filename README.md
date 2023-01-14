# Image loading library for Android (Glide - Coil - Picasso)

***
## Description about libraries:

### 1- Glide
A quick and effective open-source media management and image loading framework for Android, Glide combines resource pooling, memory and disc caching, and media decoding into a user-friendly interface. Additionally, it allows for the retrieval, decoding, and display of video stills, pictures, and animated GIFs.

### 2- Coil
These days, The Coil is gaining more and more popularity. Why is it growing more common? due to the fact that Kotlin was used in its creation. Coil handles Kotlin Coroutines and OkHttp and is fast, lightweight, and modern. Coil is the first open source image loading library written in Kotlin for android, so keep that in mind.

### 3- Picasso
a strong Android image downloader and cache library tool. One of the first libraries in this field to be founded. On the one hand, this raises the risk in my opinion, that new technologies won't be supported because of the outdated source.
***

## Measure the performance of these libraries:

The point is to measure and give you a rough idea of Coils Glide and Picasso performance and when to use each. So, we'll compare how quickly files are downloaded from the network and loaded from the cache.


### The first table is used for network downloads. The second table is a part of the cache load:
Take note that these times represent the average of ten tries.

<p href="url" align="center"  >
  <img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/pic1.png" height="300" width="420"  />
 <img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/pic2.png"   height="300" width="420" /> 
</p>

### The following table shows the average load time, as well as the time required to load the entire list of images, either as a first load or from cache:
<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/image_loading_android_libraries_glide_coil_picasso/blob/master/pic3.png" height="300" width="420" ></p>

***
## Conclusion:
For a good understanding of the outcomes we obtained Picasso and Coil produce similar results, but Glide moves more quickly. But what happens when we load images from the cache? We typically have the best times for Glide, as you can see in the images above. Picasso is by far last, followed by Coil.

The time it takes to load the entire list of images is another important issue. These figures are significant in this example because they represent the amount of time the user must wait before seeing the entire list of images. Picasso is the next fastest to load images from the network, followed by Glide, and Coil is the slowest. When loading from cache, the outcomes differ. Picasso is the slowest, while Glide and Coil share the top spot.

