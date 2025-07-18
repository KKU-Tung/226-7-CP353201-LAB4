package sqa.test;
import static org.junit.jupiter.api.Assertions.*;

import sqa.main.Ranking;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Test;

class RobustnessTest1 {
	Ranking ranking = new Ranking();
	
	@ParameterizedTest
	@CsvFileSource(files = "src/TestCSV/robusttest1x.csv", numLinesToSkip = 1)
	
	void CalculateMembershipRank_Test2(int purchaseTotal, int frequency, int pointCollected, String expectedRank) {
		String rankResult = ranking.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		assertEquals(expectedRank, rankResult);
	}
}
