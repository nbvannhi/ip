package bloom.task;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EventTest {

	@Test
	public void newEventTest() {
		LocalDateTime datetime = LocalDateTime.of(2021, 1, 1, 12, 0, 0);
		Event d = new Event("sample", datetime);
		assertEquals("sample", d.description);
		assertFalse(d.isDone);
		assertEquals(datetime, d.at);
	}

	@Test
	public void toStringTest() {
		LocalDateTime datetime = LocalDateTime.of(2021, 1, 1, 12, 0, 0);
		Event d = new Event("sample", datetime);
		assertEquals("[E][ ] sample (at: 2021-01-01T12:00)", d.toString());
	}

	@Test
	public void toDbTest() {
		LocalDateTime datetime = LocalDateTime.of(2021, 1, 1, 12, 0, 0);
		Event d = new Event("sample", datetime);
		assertEquals("E | 0 | sample | 2021-01-01T12:00", d.toDb());
	}
}
