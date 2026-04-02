# Name: Rusho Binnabi
# Date: 4/2/2026
# Project: Link Embedder
# Contact: RushoBinnabi123@yahoo.com


# This LinkEmbedderTests program tests the Link Embedder program.

import unittest
import LinkEmbedder
import pyperclip

class LinkEmbedderTest(unittest.TestCase):
   
    def testAddToEmbeds(self):
        self.assertEqual(LinkEmbedder.addToEmbeds("twitter.com"), print(LinkEmbedder.embeds))

    def testReplaceEmbed(self):
        self.assertEqual(LinkEmbedder.replaceEmbed("reddit.com", "rxddit.com"), print(LinkEmbedder.embeds))

    def testGetOriginalLink(self): # this supposedly works but the variable is inside another fie and is imported here as a function hence the error.
        self.assertEqual(LinkEmbedder.getOriginalLink("twitter.com"), print(LinkEmbedder.originalLinkStorage))

    def testChangeEmbed(self): # this also supposedly works but the variable is inside another fie and is imported here as a function hence the error.
        self.assertTrue(LinkEmbedder.changeEmbed(), "https://fxtwitter.com/rebbford/status/2036768135814971749")

    def testGetNewEmbed(self): # this also supposedly works but the variable is inside another fie and is imported here as a function hence the error.
        self.assertTrue(LinkEmbedder.getNewEmbed(), pyperclip.paste())

if __name__ == "__main__":
    unittest.main()