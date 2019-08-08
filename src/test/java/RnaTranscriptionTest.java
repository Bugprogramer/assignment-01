import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RnaTranscriptionTest {
    private RnaTranscription rnaTranscription;
    @Test
    public void testEmptyRnaSequence() {
        rnaTranscription = new RnaTranscription();
        assertEquals("", rnaTranscription.transcribe(""));
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        rnaTranscription = new RnaTranscription();
        assertEquals("G", rnaTranscription.transcribe("C"));
    }
    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        rnaTranscription = new RnaTranscription();
        assertEquals("C", rnaTranscription.transcribe("G"));
    }
    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        rnaTranscription = new RnaTranscription();
        assertEquals("A", rnaTranscription.transcribe("T"));
    }
    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        rnaTranscription = new RnaTranscription();
        assertEquals("U", rnaTranscription.transcribe("A"));
    }
    @Test
    public void testRnaTranscription() {
        rnaTranscription = new RnaTranscription();
        assertEquals("UGCACCAGAAUU", rnaTranscription.transcribe("ACGTGGTCTTAA"));
    }

}
