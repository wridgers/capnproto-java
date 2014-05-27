package org.capnproto;

import org.capnproto.test.Test._;



object TestUtil {
  def initTestMessage(builder : TestAllTypes.Builder) {
    builder.setVoidField();
    builder.setBoolField(true);
    builder.setInt8Field(-123);
    builder.setInt16Field(-12345);
    builder.setInt32Field(-12345678);
    builder.setInt64Field(-123456789012345L);
    builder.setUInt8Field(0xef.toByte);
    builder.setUInt16Field(0x4567);
    builder.setUInt32Field(0x34567890);
    builder.setUInt64Field(0x1234567890123456L);
    builder.setFloat32Field(1234.5f);
    builder.setFloat64Field(-123e45);
    builder.setTextField(new Text.Reader("foo"));
//    builder.setDataField(data("bar"));

  }


  def checkTestMessage(builder : TestAllTypes.Builder) {
    builder.getVoidField();
    assert(builder.getBoolField() == true);
    assert(builder.getInt8Field() == -123);
    assert(builder.getInt16Field() == -12345);
    assert(builder.getInt32Field() == -12345678);
    assert(builder.getInt64Field() == -123456789012345L);
    assert(builder.getUInt8Field() == 0xef.toByte);
    assert(builder.getUInt16Field() == 0x4567);
    assert(builder.getUInt32Field() == 0x34567890);
    assert(builder.getUInt64Field() == 0x1234567890123456L);
    assert(builder.getFloat32Field() == 1234.5f);
    assert(builder.getFloat64Field() == -123e45);
    //assert(builder.getTextField().toString() == "foo");
  }

}
