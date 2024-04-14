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

There are a variety of scenarios to test, such as downloading large images and resizing them to fit the container. Since the outcomes in other scenarios could be very different, I am unable to discuss them. Running ten tests for each scenario is not enough to be taxative because, as you are aware, statistics is a science of large numbers, though we can get a general idea of performance.

keep in mind, since Coil is a new library, future versions may see an improvement in performance. Let's see how it develops since we are comparing it to established libraries.

In particular, when your app does not heavily rely on image loading, I would like to emphasise that performance is not everything. For example, you will find that the bags will definitely need more patterns to show the pictures. At this point, it will search for the library that supports it. And I notice that the Coil library supports more styles for displaying URL images than the Glide library. Because Coil was created to be used with Kotlin, the code is, in my opinion, cleaner and more concise overall when using Coil.

Lastly, Glide is faster if you're looking for a very good performance, at least in this case.
***
## Code Implmentation:
I've implemented simple code to demonstrate the capabilities of the Coil and Glide libraries as well as I can. I've built two screens for each image loader library one for Coil and one for Glide. After doing the code, I noticed that Coil library is more supported for loading images than Glide library. But as we discussed, Glide is faster than Coil. You will find everything you need to deploy a Coil or Glide library from dependencies to Kotlin code.

<p href="url"  align="center" ><img src="https://github.com/AhmedSamirScience/Image_loading_android_libraries_glide_coil_picasso/blob/master/gif1.gif" height="600" width="300" ></p>

***
### All the resources I got for this topic:
[Coil-Github](https://github.com/coil-kt/coil)
[URL Images for Testing](https://www.infogrepper.com/image-url-for-testing/)
[video Code(1)](https://www.youtube.com/watch?v=LsJza8kCtTs&ab_channel=AppCodeStudio)
[video Code(2)](https://www.youtube.com/watch?v=IBaUjzn2Rgo&ab_channel=Stevdza-San)
[video Code(3)](https://www.youtube.com/watch?v=drEPpZBMYAI&ab_channel=AppCodeStudio)
[Glide-Github](https://github.com/bumptech/glide)
[Article(1)](https://tech.instacart.com/introducing-coil-kotlin-first-image-loading-on-android-f0fdc7a2a99e)
[Article(2)](https://proandroiddev.com/coil-vs-picasso-vs-glide-get-ready-go-774add8cfd40)


***
## ➠ Start Contributing ☺
I will be more than happy if you decide to contribute and/or fork my repo and make something awesome out of it. I will love seeing some feedback or stars from you guys.

***


