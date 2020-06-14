/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.jena.riot.thrift.wire;

@SuppressWarnings("all")
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-24")
public class RDF_StreamRow extends org.apache.thrift.TUnion<RDF_StreamRow, RDF_StreamRow._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RDF_StreamRow");
  private static final org.apache.thrift.protocol.TField PREFIX_DECL_FIELD_DESC = new org.apache.thrift.protocol.TField("prefixDecl", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TRIPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("triple", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField QUAD_FIELD_DESC = new org.apache.thrift.protocol.TField("quad", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PREFIX_DECL((short)1, "prefixDecl"),
    TRIPLE((short)2, "triple"),
    QUAD((short)3, "quad");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PREFIX_DECL
          return PREFIX_DECL;
        case 2: // TRIPLE
          return TRIPLE;
        case 3: // QUAD
          return QUAD;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PREFIX_DECL, new org.apache.thrift.meta_data.FieldMetaData("prefixDecl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_PrefixDecl.class)));
    tmpMap.put(_Fields.TRIPLE, new org.apache.thrift.meta_data.FieldMetaData("triple", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Triple.class)));
    tmpMap.put(_Fields.QUAD, new org.apache.thrift.meta_data.FieldMetaData("quad", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Quad.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RDF_StreamRow.class, metaDataMap);
  }

  public RDF_StreamRow() {
    super();
  }

  public RDF_StreamRow(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public RDF_StreamRow(RDF_StreamRow other) {
    super(other);
  }
  public RDF_StreamRow deepCopy() {
    return new RDF_StreamRow(this);
  }

  public static RDF_StreamRow prefixDecl(RDF_PrefixDecl value) {
    RDF_StreamRow x = new RDF_StreamRow();
    x.setPrefixDecl(value);
    return x;
  }

  public static RDF_StreamRow triple(RDF_Triple value) {
    RDF_StreamRow x = new RDF_StreamRow();
    x.setTriple(value);
    return x;
  }

  public static RDF_StreamRow quad(RDF_Quad value) {
    RDF_StreamRow x = new RDF_StreamRow();
    x.setQuad(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case PREFIX_DECL:
        if (value instanceof RDF_PrefixDecl) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type RDF_PrefixDecl for field 'prefixDecl', but got " + value.getClass().getSimpleName());
      case TRIPLE:
        if (value instanceof RDF_Triple) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type RDF_Triple for field 'triple', but got " + value.getClass().getSimpleName());
      case QUAD:
        if (value instanceof RDF_Quad) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type RDF_Quad for field 'quad', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case PREFIX_DECL:
          if (field.type == PREFIX_DECL_FIELD_DESC.type) {
            RDF_PrefixDecl prefixDecl;
            prefixDecl = new RDF_PrefixDecl();
            prefixDecl.read(iprot);
            return prefixDecl;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TRIPLE:
          if (field.type == TRIPLE_FIELD_DESC.type) {
            RDF_Triple triple;
            triple = new RDF_Triple();
            triple.read(iprot);
            return triple;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case QUAD:
          if (field.type == QUAD_FIELD_DESC.type) {
            RDF_Quad quad;
            quad = new RDF_Quad();
            quad.read(iprot);
            return quad;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PREFIX_DECL:
        RDF_PrefixDecl prefixDecl = (RDF_PrefixDecl)value_;
        prefixDecl.write(oprot);
        return;
      case TRIPLE:
        RDF_Triple triple = (RDF_Triple)value_;
        triple.write(oprot);
        return;
      case QUAD:
        RDF_Quad quad = (RDF_Quad)value_;
        quad.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case PREFIX_DECL:
          RDF_PrefixDecl prefixDecl;
          prefixDecl = new RDF_PrefixDecl();
          prefixDecl.read(iprot);
          return prefixDecl;
        case TRIPLE:
          RDF_Triple triple;
          triple = new RDF_Triple();
          triple.read(iprot);
          return triple;
        case QUAD:
          RDF_Quad quad;
          quad = new RDF_Quad();
          quad.read(iprot);
          return quad;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PREFIX_DECL:
        RDF_PrefixDecl prefixDecl = (RDF_PrefixDecl)value_;
        prefixDecl.write(oprot);
        return;
      case TRIPLE:
        RDF_Triple triple = (RDF_Triple)value_;
        triple.write(oprot);
        return;
      case QUAD:
        RDF_Quad quad = (RDF_Quad)value_;
        quad.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case PREFIX_DECL:
        return PREFIX_DECL_FIELD_DESC;
      case TRIPLE:
        return TRIPLE_FIELD_DESC;
      case QUAD:
        return QUAD_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public RDF_PrefixDecl getPrefixDecl() {
    if (getSetField() == _Fields.PREFIX_DECL) {
      return (RDF_PrefixDecl)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'prefixDecl' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPrefixDecl(RDF_PrefixDecl value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.PREFIX_DECL;
    value_ = value;
  }

  public RDF_Triple getTriple() {
    if (getSetField() == _Fields.TRIPLE) {
      return (RDF_Triple)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'triple' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTriple(RDF_Triple value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TRIPLE;
    value_ = value;
  }

  public RDF_Quad getQuad() {
    if (getSetField() == _Fields.QUAD) {
      return (RDF_Quad)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'quad' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setQuad(RDF_Quad value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.QUAD;
    value_ = value;
  }

  public boolean isSetPrefixDecl() {
    return setField_ == _Fields.PREFIX_DECL;
  }


  public boolean isSetTriple() {
    return setField_ == _Fields.TRIPLE;
  }


  public boolean isSetQuad() {
    return setField_ == _Fields.QUAD;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof RDF_StreamRow) {
      return equals((RDF_StreamRow)other);
    } else {
      return false;
    }
  }

  public boolean equals(RDF_StreamRow other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(RDF_StreamRow other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
