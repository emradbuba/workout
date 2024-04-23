package com.emradbuba.learning.workout.dataconsolidator.matcher;

import com.emradbuba.learning.workout.dataconsolidator.matcher.custom.Counterparty;
import com.emradbuba.learning.workout.dataconsolidator.matcher.custom.CustomRecord;
import com.emradbuba.learning.workout.dataconsolidator.matcher.custom.Ticker;
import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchedItem;
import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchingResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataMatcherImplCustomRecordTest {
    private DataMatcherImpl<CustomRecord> dataMatcherImpl;

    @BeforeEach
    void setUp() {
        dataMatcherImpl = new DataMatcherImpl<>(Object::hashCode);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInBothListsWhenNoDuplicates() {
        List<CustomRecord> listA = List.of(RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().contains(RECORD_B_20_10_DUC_EUC));
        assertTrue(result.getUnMatchedB().contains(RECORD_A_10_10_DUC_EUC));
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoUnmatchedElementsWhenNoSuchInListA() {
        List<CustomRecord> listA = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().isEmpty());
        assertTrue(result.getUnMatchedB().contains(RECORD_D_10_10_M20_EUC));
        assertEquals(1, result.getUnMatchedB().size());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoUnmatchedElementsWhenNoSuchInListB() {
        List<CustomRecord> listA = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedB().isEmpty());
        assertTrue(result.getUnMatchedA().contains(RECORD_E_10_10_DUC_INS));
        assertEquals(1, result.getUnMatchedA().size());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoUnmatchedElementsWhenListContainsSameElements() {
        List<CustomRecord> listA = List.of(RECORD_B_20_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_E_10_10_DUC_INS, RECORD_D_10_10_M20_EUC);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().isEmpty());
        assertTrue(result.getUnMatchedB().isEmpty());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInBothListsWithDuplicates() {
        List<CustomRecord> listA = List.of(RECORD_B_20_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS, RECORD_E_10_10_DUC_INS);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS, RECORD_E_10_10_DUC_INS, RECORD_E_10_10_DUC_INS);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertNotNull(result.getUnMatchedA());
        assertNotNull(result.getUnMatchedB());
        assertEquals(5, result.getUnMatchedA().size());
        assertEquals(2, result.getUnMatchedA().stream().filter(item -> item.equals(RECORD_B_20_10_DUC_EUC)).count());
        assertEquals(2, result.getUnMatchedA().stream().filter(item -> item.equals(RECORD_C_10_20_DUC_EUC)).count());
        assertEquals(1, result.getUnMatchedA().stream().filter(item -> item.equals(RECORD_D_10_10_M20_EUC)).count());
        assertEquals(5, result.getUnMatchedA().size());
        assertEquals(1, result.getUnMatchedB().stream().filter(item -> item.equals(RECORD_A_10_10_DUC_EUC)).count());
        assertEquals(1, result.getUnMatchedB().stream().filter(item -> item.equals(RECORD_E_10_10_DUC_INS)).count());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInListAWhenSameElementButDifferentSize() {
        List<CustomRecord> listA = List.of(RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertArrayEquals(new CustomRecord[]{RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC}, result.getUnMatchedA().toArray());
        assertEquals(1, result.getUnMatchedA().stream().distinct().count());
        assertTrue(result.getUnMatchedB().isEmpty());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectMatchingPairs() {
        List<CustomRecord> listA = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_B_20_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertEquals(5, result.getMatched().size());
        for (MatchedItem<CustomRecord> doubleMatchedItem : result.getMatched()) {
            assertEquals(doubleMatchedItem.item1(), doubleMatchedItem.item2());
        }
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectMatchingPairsWhenOnlyOne() {
        List<CustomRecord> listA = List.of(RECORD_B_20_10_DUC_EUC, RECORD_D_10_10_M20_EUC, RECORD_E_10_10_DUC_INS);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_D_10_10_M20_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertEquals(1, result.getMatched().size());
        assertEquals(RECORD_D_10_10_M20_EUC, result.getMatched().get(0).item1());
        assertEquals(RECORD_D_10_10_M20_EUC, result.getMatched().get(0).item2());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectMatchingPairsWhenListsOfEqualElements() {
        List<CustomRecord> listA = List.of(RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC);
        List<CustomRecord> listB = List.of(RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC, RECORD_A_10_10_DUC_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertEquals(3, result.getMatched().size());
        for (MatchedItem<CustomRecord> doubleMatchedItem : result.getMatched()) {
            assertEquals(RECORD_A_10_10_DUC_EUC, doubleMatchedItem.item1());
            assertEquals(RECORD_A_10_10_DUC_EUC, doubleMatchedItem.item2());
        }
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoMatchingPairsWhenThereIsNo() {
        List<CustomRecord> listA = List.of(RECORD_A_10_10_DUC_EUC, RECORD_C_10_20_DUC_EUC, RECORD_E_10_10_DUC_INS);
        List<CustomRecord> listB = List.of(RECORD_B_20_10_DUC_EUC, RECORD_D_10_10_M20_EUC);

        MatchingResult<CustomRecord> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getMatched().isEmpty());
        System.out.println(result);
    }

    private static CustomRecord RECORD_A_10_10_DUC_EUC = new CustomRecord(10.0, 10, Ticker.DUC, Counterparty.EUC);
    private static CustomRecord RECORD_B_20_10_DUC_EUC = new CustomRecord(20.0, 10, Ticker.DUC, Counterparty.EUC);
    private static CustomRecord RECORD_C_10_20_DUC_EUC = new CustomRecord(10.0, 20, Ticker.DUC, Counterparty.EUC);
    private static CustomRecord RECORD_D_10_10_M20_EUC = new CustomRecord(10.0, 10, Ticker.M20, Counterparty.EUC);
    private static CustomRecord RECORD_E_10_10_DUC_INS = new CustomRecord(10.0, 10, Ticker.DUC, Counterparty.INS);
}