//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import edu.isi.bmkeg.lapdf.pmcXml.mathml.PmcXmlMath;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}hr"/>
 *         &lt;element ref="{}inline-supplementary-material"/>
 *         &lt;element ref="{}related-article"/>
 *         &lt;element ref="{}related-object"/>
 *         &lt;element ref="{}disp-formula"/>
 *         &lt;element ref="{}disp-formula-group"/>
 *         &lt;element ref="{}break"/>
 *         &lt;element ref="{}element-citation"/>
 *         &lt;element ref="{}mixed-citation"/>
 *         &lt;element ref="{}nlm-citation"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}def-list"/>
 *         &lt;element ref="{}list"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}abbrev"/>
 *         &lt;element ref="{}milestone-end"/>
 *         &lt;element ref="{}milestone-start"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}array"/>
 *         &lt;element ref="{}graphic"/>
 *         &lt;element ref="{}media"/>
 *         &lt;element ref="{}preformat"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}fn"/>
 *         &lt;element ref="{}target"/>
 *         &lt;element ref="{}xref"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="axis" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="headers" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="scope">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="row"/>
 *             &lt;enumeration value="col"/>
 *             &lt;enumeration value="rowgroup"/>
 *             &lt;enumeration value="colgroup"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" />
 *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" />
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *             &lt;enumeration value="justify"/>
 *             &lt;enumeration value="char"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="charoff" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="valign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="top"/>
 *             &lt;enumeration value="middle"/>
 *             &lt;enumeration value="bottom"/>
 *             &lt;enumeration value="baseline"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "th")
public class PmcXmlTh {

    @XmlElementRefs({
        @XmlElementRef(name = "element-citation", type = PmcXmlElementCitation.class, required = false),
        @XmlElementRef(name = "inline-formula", type = PmcXmlInlineFormula.class, required = false),
        @XmlElementRef(name = "sub", type = PmcXmlSub.class, required = false),
        @XmlElementRef(name = "sup", type = PmcXmlSup.class, required = false),
        @XmlElementRef(name = "array", type = PmcXmlArray.class, required = false),
        @XmlElementRef(name = "ext-link", type = PmcXmlExtLink.class, required = false),
        @XmlElementRef(name = "milestone-end", type = PmcXmlMilestoneEnd.class, required = false),
        @XmlElementRef(name = "chem-struct", type = PmcXmlChemStruct.class, required = false),
        @XmlElementRef(name = "target", type = PmcXmlTarget.class, required = false),
        @XmlElementRef(name = "private-char", type = PmcXmlPrivateChar.class, required = false),
        @XmlElementRef(name = "nlm-citation", type = PmcXmlNlmCitation.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMath.class, required = false),
        @XmlElementRef(name = "sc", type = PmcXmlSc.class, required = false),
        @XmlElementRef(name = "hr", type = PmcXmlHr.class, required = false),
        @XmlElementRef(name = "monospace", type = PmcXmlMonospace.class, required = false),
        @XmlElementRef(name = "disp-formula", type = PmcXmlDispFormula.class, required = false),
        @XmlElementRef(name = "underline", type = PmcXmlUnderline.class, required = false),
        @XmlElementRef(name = "sans-serif", type = PmcXmlSansSerif.class, required = false),
        @XmlElementRef(name = "email", type = PmcXmlEmail.class, required = false),
        @XmlElementRef(name = "italic", type = PmcXmlItalic.class, required = false),
        @XmlElementRef(name = "roman", type = PmcXmlRoman.class, required = false),
        @XmlElementRef(name = "fn", type = PmcXmlFn.class, required = false),
        @XmlElementRef(name = "break", type = PmcXmlBreak.class, required = false),
        @XmlElementRef(name = "styled-content", type = PmcXmlStyledContent.class, required = false),
        @XmlElementRef(name = "media", type = PmcXmlMedia.class, required = false),
        @XmlElementRef(name = "graphic", type = PmcXmlGraphic.class, required = false),
        @XmlElementRef(name = "milestone-start", type = PmcXmlMilestoneStart.class, required = false),
        @XmlElementRef(name = "disp-formula-group", type = PmcXmlDispFormulaGroup.class, required = false),
        @XmlElementRef(name = "preformat", type = PmcXmlPreformat.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = PmcXmlInlineGraphic.class, required = false),
        @XmlElementRef(name = "tex-math", type = PmcXmlTexMath.class, required = false),
        @XmlElementRef(name = "list", type = PmcXmlList.class, required = false),
        @XmlElementRef(name = "related-article", type = PmcXmlRelatedArticle.class, required = false),
        @XmlElementRef(name = "alternatives", type = PmcXmlAlternatives.class, required = false),
        @XmlElementRef(name = "named-content", type = PmcXmlNamedContent.class, required = false),
        @XmlElementRef(name = "def-list", type = PmcXmlDefList.class, required = false),
        @XmlElementRef(name = "mixed-citation", type = PmcXmlMixedCitation.class, required = false),
        @XmlElementRef(name = "inline-supplementary-material", type = PmcXmlInlineSupplementaryMaterial.class, required = false),
        @XmlElementRef(name = "abbrev", type = PmcXmlAbbrev.class, required = false),
        @XmlElementRef(name = "overline", type = PmcXmlOverline.class, required = false),
        @XmlElementRef(name = "related-object", type = PmcXmlRelatedObject.class, required = false),
        @XmlElementRef(name = "uri", type = PmcXmlUri.class, required = false),
        @XmlElementRef(name = "bold", type = PmcXmlBold.class, required = false),
        @XmlElementRef(name = "strike", type = PmcXmlStrike.class, required = false),
        @XmlElementRef(name = "xref", type = PmcXmlXref.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "abbr")
    @XmlSchemaType(name = "anySimpleType")
    protected String abbr;
    @XmlAttribute(name = "axis")
    @XmlSchemaType(name = "anySimpleType")
    protected String axis;
    @XmlAttribute(name = "headers")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> headers;
    @XmlAttribute(name = "scope")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scope;
    @XmlAttribute(name = "rowspan")
    @XmlSchemaType(name = "anySimpleType")
    protected String rowspan;
    @XmlAttribute(name = "colspan")
    @XmlSchemaType(name = "anySimpleType")
    protected String colspan;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "char")
    @XmlSchemaType(name = "anySimpleType")
    protected String _char;
    @XmlAttribute(name = "charoff")
    @XmlSchemaType(name = "anySimpleType")
    protected String charoff;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlElementCitation }
     * {@link PmcXmlInlineFormula }
     * {@link PmcXmlSub }
     * {@link PmcXmlSup }
     * {@link PmcXmlArray }
     * {@link PmcXmlExtLink }
     * {@link PmcXmlChemStruct }
     * {@link PmcXmlMilestoneEnd }
     * {@link PmcXmlPrivateChar }
     * {@link PmcXmlTarget }
     * {@link PmcXmlNlmCitation }
     * {@link PmcXmlMath }
     * {@link PmcXmlSc }
     * {@link PmcXmlHr }
     * {@link PmcXmlMonospace }
     * {@link PmcXmlUnderline }
     * {@link PmcXmlDispFormula }
     * {@link PmcXmlSansSerif }
     * {@link PmcXmlItalic }
     * {@link PmcXmlEmail }
     * {@link PmcXmlRoman }
     * {@link PmcXmlBreak }
     * {@link PmcXmlFn }
     * {@link PmcXmlStyledContent }
     * {@link PmcXmlMedia }
     * {@link PmcXmlGraphic }
     * {@link PmcXmlDispFormulaGroup }
     * {@link PmcXmlMilestoneStart }
     * {@link PmcXmlPreformat }
     * {@link PmcXmlList }
     * {@link PmcXmlTexMath }
     * {@link PmcXmlInlineGraphic }
     * {@link String }
     * {@link PmcXmlRelatedArticle }
     * {@link PmcXmlAlternatives }
     * {@link PmcXmlNamedContent }
     * {@link PmcXmlDefList }
     * {@link PmcXmlInlineSupplementaryMaterial }
     * {@link PmcXmlMixedCitation }
     * {@link PmcXmlOverline }
     * {@link PmcXmlAbbrev }
     * {@link PmcXmlRelatedObject }
     * {@link PmcXmlUri }
     * {@link PmcXmlBold }
     * {@link PmcXmlStrike }
     * {@link PmcXmlXref }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<Object>();
        }
        return this.headers;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspan() {
        if (rowspan == null) {
            return "1";
        } else {
            return rowspan;
        }
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspan(String value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColspan() {
        if (colspan == null) {
            return "1";
        } else {
            return colspan;
        }
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColspan(String value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the charoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * Sets the value of the charoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
    }

}