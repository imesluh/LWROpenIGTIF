/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package OpenIGTLink.swig;

public class IGTLpoint implements IGTLpointConstants {
  public static void igtl_point_convert_byte_order(igtl_point_element pointlist, int nelem) {
    IGTLpointJNI.igtl_point_convert_byte_order(igtl_point_element.getCPtr(pointlist), pointlist, nelem);
  }

  public static java.math.BigInteger igtl_point_get_crc(igtl_point_element pointlist, int nelem) {
    return IGTLpointJNI.igtl_point_get_crc(igtl_point_element.getCPtr(pointlist), pointlist, nelem);
  }

}