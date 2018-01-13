package wjc.ddt.test.cases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.assertj.core.api.Assertions;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.*;
import wjc.ddt.bean.DataDriverBean;
import wjc.ddt.test.bean.Address;
import wjc.ddt.test.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2018-01-13 11:06
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class DdtTestCase {

    @Test
    public void printPettyJsonString() throws JsonProcessingException {
        Address address = new Address(123456, "china",
                "guangzhou", "shenzhen", "bantian");
        List<Address> addressList = new ArrayList<>();
        addressList.add(address);

        Person person = new Person(123456789, "Wang", "Junchao",  addressList);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        System.out.println(writer.writeValueAsString(person));

        System.out.println(writer.writeValueAsString(new DataDriverBean()));
    }

    @Test
    public void testJsonAssertInGeneral() throws JSONException {
        String actual = "{\"a\": 1, \"b\": 2}";
        String expect = "{\"a\": 1, \"b\": 2}";
        JSONAssert.assertEquals(actual, expect, false);
    }

    @Test
    public void testJsonAssertIgnoreOrder() throws JSONException {
        String actual = "{\"a\": 1, \"b\": 2}";
        String expect = "{\"b\": 2, \"a\": 1}";

        JSONCompareResult result = JSONCompare.compareJSON(actual, expect, JSONCompareMode.NON_EXTENSIBLE);
        System.out.println(result.getMessage());
        Assert.assertTrue(result.passed());


    }

    @Test
    public void testJsonContainAssert() throws JSONException {
        String actual = "{\"a\": 1, \"b\": 2}";
        String expect = "{\"b\": 2, \"a\": 1, \"c\": 3}";

        JSONCompareResult result = JSONCompare.compareJSON(actual, expect, JSONCompareMode.NON_EXTENSIBLE);
        // 判断比较actual中是否有不存在的字段
        System.out.println(result.getMessage());
        Assert.assertTrue(result.getFieldMissing().isEmpty());
    }

    @Test
    public void testJsonContainAssert2() throws JSONException {
        String actual = "{\"a\": 1, \"b\": 2, \"c\": 3}";
        String expect = "{\"b\": 2, \"a\": 1}";

        JSONCompareResult result = JSONCompare.compareJSON(actual, expect, JSONCompareMode.NON_EXTENSIBLE);
        // 判断比较actual中是否有不存在的字段
        List<FieldComparisonFailure> fieldComparisonFailures = result.getFieldMissing();
        System.out.println(result.getMessage());
        Assert.assertFalse(fieldComparisonFailures.isEmpty());
    }


    @Test
    public void testJsonContainAssert3() throws JSONException {
        String actual = "{\"a\": 1,\"b\": 2,\"c\": {\"d\": 4,\"f\": [5,6,7,8,9]}}";
        String expect = "{\"a\": 1,\"b\": 2,\"c\": {\"d\": 4,\"f\": [5,6,7,8]}}";

        JSONCompareResult result = JSONCompare.compareJSON(actual, expect, JSONCompareMode.NON_EXTENSIBLE);
        // 判断比较actual中是否有不存在的字段
        List<FieldComparisonFailure> fieldComparisonFailures = result.getFieldMissing();
        for (FieldComparisonFailure f: fieldComparisonFailures             ) {
            System.out.println(f.getExpected());
        }

        System.out.println(result.getMessage());
        Assert.assertFalse(result.passed());
    }
}
