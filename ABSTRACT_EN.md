# Abstract

Scala is a language with many qualities, but it has more than its share of quirks and small things that don't exactly behave as you'd expect.

This talk is about the more commons gotchas in the language, and the standard recipes we have for dealing with them. A lot of them are assumed to be common knowledge and never really brought up, which means that a lot of Scala developers had to find out about them the hard way.

The purpose of this talk is to try and save some pain by putting the worst offenders in the spotlight and, hopefully, starting conversations around them.


# Required Knowledge

Some familiarity with the language, while not required, would help get the most out of this talk. The best practices are explained in terms of the traps they allow us to avoid, and it can be hard to understand these traps without at least some basic understanding of the language.

# Learning Objectives

At the end of the session, attendees should have learned:
* common traps that they might not be aware of
* the reason for a lot of things Scala developers do but don't know why (extends Product with Serializable, this type of thing)
* about tools, including the compiler, they can use to detect most of these
