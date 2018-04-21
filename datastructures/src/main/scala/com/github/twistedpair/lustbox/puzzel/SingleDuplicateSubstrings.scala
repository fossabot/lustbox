package com.github.twistedpair.lustbox.puzzel

/**
  * For string S, find all substrings of length k with exactly one duplicate character
  */
object SingleDuplicateSubstrings {

  def findDupes(s:String, k:Int):Seq[String] =
    if (s.size >= k) s.sliding(k).filter(_.toSet.size == k-1).toList else Nil
}
