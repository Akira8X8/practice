/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflixapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**


● Number of Seasons
● For each Season:
○ Overall Series Episode
○ Season Episode
○ Episode Title
○ Original Released Year

 */
public class TVShow extends StreamingVideo{
    
   public TVShow(String filePath) throws FileNotFoundException {
        File tvFile = new File(filePath);
        Scanner tvScanner = new Scanner(tvFile);
        getTitle();

    }
    
}
