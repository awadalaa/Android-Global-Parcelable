Android-Global-Parcelable
=========================

Serialization in Java was far too slow for Android, so they created the Parcelable class that android developers use to serialize data.  The Parcelable approach requires that you explicitly serialize the members of your class, but in the end, you get a much faster serialization of your objects. The problem is you have to do this with every class you create.  In a large project with many classes with many objects this becomes tedious violating the rules of code reusability.  The solution is to create the Global Parcelable class that all other classes can extend.  
