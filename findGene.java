public class findGene {
    public String findGeneString(String dna){
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
            
        }
        int stopIndex = dna.indexOf("TAA",startIndex + 3);
        if(stopIndex==-1){
            return "";
        }
        if((stopIndex-startIndex) % 3 ==0){
            return dna.substring(startIndex, stopIndex + 3);
        }
        else{
            return "";
        }
    }

    public void testSimpleGene() {
        // Test cases for DNA strings
        String dna1 = "ACGTACGTTAG";  // No "ATG"
        String dna2 = "ATGCGTACGTC";  // No "TAA"
        String dna3 = "ACGTACGTACG";  // No "ATG" or "TAA"
        String dna4 = "ATGCGTAA";     // Valid gene (length multiple of 3)
        String dna5 = "ATGCGTAACGT";  // No gene (length not a multiple of 3)

        // Print and test each DNA string
        System.out.println("DNA1: " + dna1);
        System.out.println("Gene: " + findGeneString(dna1));

        System.out.println("DNA2: " + dna2);
        System.out.println("Gene: " + findGeneString(dna2));

        System.out.println("DNA3: " + dna3);
        System.out.println("Gene: " + findGeneString(dna3));

        System.out.println("DNA4: " + dna4);
        System.out.println("Gene: " + findGeneString(dna4));

        System.out.println("DNA5: " + dna5);
        System.out.println("Gene: " + findGeneString(dna5));
    }
    
}
