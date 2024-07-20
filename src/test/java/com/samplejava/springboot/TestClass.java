package com.samplejava.springboot;

import com.samplejava.springboot.algorithms.collections.CommonPrefix;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

	@Autowired
	private CommonPrefix commonPrefix;

    @Test
    public void test() {
		List<String> arrayList = new ArrayList<>(Arrays.asList("facts", "faith", "family"));
		String output = commonPrefix.findCommonString(arrayList);
		assertEquals(output, "fa");
    }
}
