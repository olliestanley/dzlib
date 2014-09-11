/*
 * This file is part of sprintj, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2014 Oliver Stanley <http://ollie.pw>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pw.ollie.sprint.test;

import org.junit.Assert;
import org.junit.Test;

import pw.ollie.sprint.iterate.ArrayIterator;
import pw.ollie.sprint.iterate.EnumIterator;
import pw.ollie.sprint.util.MapBuilder.MapType;

public class IterationTest {
    @Test
    public void runTest() {
        int expected = MapType.values().length;
        EnumIterator<MapType> iterator = new EnumIterator<>(MapType.class);
        int currentCount = 0;

        while (iterator.hasNext()) {
            currentCount++;
            iterator.next();
        }

        Assert.assertEquals(expected, currentCount);

        int currentArrayCount = 0;
        ArrayIterator arrayIt = new ArrayIterator<>(MapType.values());

        while (arrayIt.hasNext()) {
            currentArrayCount++;
            arrayIt.next();
        }

        Assert.assertEquals(currentArrayCount, currentCount);
    }
}