package cascading.legstar.cobolcopybook.beans.bean13.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp13V05NotifDiaryFormat data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp13V05NotifDiaryFormatHostToJavaTransformer transformer = new Kcp13V05NotifDiaryFormatHostToJavaTransformer();
 *  Kcp13V05NotifDiaryFormat javaValue = (Kcp13V05NotifDiaryFormat) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp13V05NotifDiaryFormatHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp13V05NotifDiaryFormatHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp13V05NotifDiaryFormatHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp13V05NotifDiaryFormatHostToJavaTransformer( final String hostCharset )
    {
    super( hostCharset );
    }

  /**
   * Binding is statically produced by {@link com.legstar.coxb.gen.CoxbBindingGenerator}.
   *
   * @return a new binding corresponding to the host structure type.
   * @throws CobolBindingException if binding cannot be returned
   */
  public ICobolComplexBinding newBinding() throws CobolBindingException
    {
    return new Kcp13V05NotifDiaryFormatBinding();
    }

  }
