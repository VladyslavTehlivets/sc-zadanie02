package umcs.craftmanship;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StringUtilsTest {

	@Test
	public void shouldJoinString() {
		//given
		Joiner joiner = Joiner.on("; ").skipNulls();

		//when
		String joinedString = joiner.join("Harry", null, "Ron", "Hermione");

		//then
		Assert.assertEquals(joinedString, "Harry; Ron; Hermione");
	}

	@Test
	public void shouldJoinArray() {
		//when
		String resultString = Joiner.on(",").join(Arrays.asList(1, 5, 7));

		//then
		Assert.assertEquals("1,5,7", resultString);
	}

	@Test
	public void shouldSplitStringToArray() {
		//when
		List<String> splitedList = Splitter.on(',')
				.trimResults()
				.omitEmptyStrings()
				.splitToList("foo,bar,,   qux");

		//then
		Assert.assertArrayEquals(splitedList.toArray(), new String[] { "foo", "bar", "qux" });
	}
}
