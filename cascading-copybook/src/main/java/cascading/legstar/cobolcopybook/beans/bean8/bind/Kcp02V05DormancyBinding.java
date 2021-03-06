package cascading.legstar.cobolcopybook.beans.bean8.bind;

import cascading.legstar.cobolcopybook.beans.bean8.Kcp02V05Dormancy;
import cascading.legstar.cobolcopybook.beans.bean8.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp02V05Dormancy.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp02V05DormancyBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 3;
  /**
   * Binding factory.
   */
  private static final ICobolBindingFactory BF = CobolBindingFactory.getBindingFactory();
  /**
   * Static reference to Value object factory to be used as default.
   */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /**
   * Logger.
   */
  private final Log _log = LogFactory.getLog( getClass() );
  /**
   * Child bound to value object property Kcp02V05DormancyLastUpdate(String).
   */
  public ICobolStringBinding _kcp02V05DormancyLastUpdate;
  /**
   * Child bound to value object property Kcp02V05DormancyInd(Short).
   */
  public ICobolPackedDecimalBinding _kcp02V05DormancyInd;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp02V05Dormancy mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp02V05DormancyBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp02V05DormancyBinding( final Kcp02V05Dormancy valueObject )
    {
    this( "", "", null, valueObject );
    }

  /**
   * Constructor for a Complex element as a child of another element and
   * an associated Value object.
   *
   * @param bindingName   the identifier for this binding
   * @param fieldName     field name in parent Value object
   * @param valueObject   the concrete Value object instance bound to this
   *                      complex element
   * @param parentBinding a reference to the parent binding
   */
  public Kcp02V05DormancyBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp02V05Dormancy valueObject )
    {

    super( bindingName, fieldName, Kcp02V05Dormancy.class, null, parentBinding );
    mValueObject = valueObject;
    if( mValueObject != null )
      {
      mUnusedValueObject = true;
      }
    initChildren();
    setByteLength( BYTE_LENGTH );
    }

  /**
   * Creates a binding property for each child.
   */
  private void initChildren()
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing started" );
      }
        /* Create binding children instances */

    _kcp02V05DormancyLastUpdate = BF.createStringBinding( "Kcp02V05DormancyLastUpdate", "Kcp02V05DormancyLastUpdate", String.class, this );
    _kcp02V05DormancyLastUpdate.setCobolName( "KCP02V05-DORMANCY-LAST-UPDATE" );
    _kcp02V05DormancyLastUpdate.setByteLength( 2 );
    _kcp02V05DormancyInd = BF.createPackedDecimalBinding( "Kcp02V05DormancyInd", "Kcp02V05DormancyInd", Short.class, this );
    _kcp02V05DormancyInd.setCobolName( "KCP02V05-DORMANCY-IND" );
    _kcp02V05DormancyInd.setByteLength( 1 );
    _kcp02V05DormancyInd.setTotalDigits( 1 );
    _kcp02V05DormancyInd.setIsSigned( true );

        /* Add children to children list */
    getChildrenList().add( _kcp02V05DormancyLastUpdate );
    getChildrenList().add( _kcp02V05DormancyInd );

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing successful" );
      }
    }

  /**
   * {@inheritDoc}
   */
  public void createValueObject() throws HostException
    {
        /* Since this complex binding has a constructor that takes a
         * Value object, we might already have a Value object that
         * was not used yet. */
    if( mUnusedValueObject && mValueObject != null )
      {
      mUnusedValueObject = false;
      return;
      }
    mValueObject = mValueObjectFactory.createKcp02V05Dormancy();
    }

  /**
   * {@inheritDoc}
   */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp02V05DormancyLastUpdate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp02V05DormancyLastUpdate" + " value=" + mValueObject.getKcp02V05DormancyLastUpdate() );
      }
    _kcp02V05DormancyLastUpdate.setObjectValue( mValueObject.getKcp02V05DormancyLastUpdate() );
        /* Get Value object property _kcp02V05DormancyInd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp02V05DormancyInd" + " value=" + mValueObject.getKcp02V05DormancyInd() );
      }
    _kcp02V05DormancyInd.setObjectValue( mValueObject.getKcp02V05DormancyInd() );
    }

  /**
   * {@inheritDoc}
   */
  public void setPropertyValue( final int index ) throws HostException
    {

    ICobolBinding child = getChildrenList().get( index );

       /* Children that are not bound to a value object are ignored.
        * This includes Choices and dynamically generated counters
        * for instance.  */
    if( !child.isBound() )
      {
      return;
      }

        /* Set the Value object property value from binding object */
    Object bindingValue = null;
    switch( index )
      {
      case 0:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp02V05DormancyLastUpdate( (String) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setKcp02V05DormancyInd( (Short) bindingValue );
        break;
      default:
        break;
      }
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Setting value of Value object property " + child.getJaxbName() + " value=" + bindingValue );
      }
    }

  /**
   * {@inheritDoc}
   */
  public Object getObjectValue( final Class<?> type ) throws HostException
    {
    if( type.equals( Kcp02V05Dormancy.class ) )
      {
      return mValueObject;
      }
    else
      {
      throw new HostException( "Attempt to get binding " + getBindingName() + " as an incompatible type " + type );
      }
    }

  /**
   * {@inheritDoc}
   */
  public void setObjectValue( final Object bindingValue ) throws HostException
    {
    if( bindingValue == null )
      {
      mValueObject = null;
      return;
      }
    if( bindingValue.getClass().equals( Kcp02V05Dormancy.class ) )
      {
      mValueObject = (Kcp02V05Dormancy) bindingValue;
      }
    else
      {
      throw new HostException( "Attempt to set binding " + getBindingName() + " from an incompatible value " + bindingValue );
      }
    }

  /**
   * @return the java object factory for objects creation
   */
  public ObjectFactory getObjectFactory()
    {
    return mValueObjectFactory;
    }

  /**
   * @param valueObjectFactory the java object factory for objects creation
   */
  public void setObjectFactory( final Object valueObjectFactory )
    {
    mValueObjectFactory = (ObjectFactory) valueObjectFactory;
    }

  /**
   * {@inheritDoc}
   */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound Value object
   */
  public Kcp02V05Dormancy getKcp02V05Dormancy()
    {
    return mValueObject;
    }

  /**
   * The COBOL complex element maximum length in bytes.
   *
   * @return COBOL complex element maximum length in bytes
   */
  public int getByteLength()
    {
    return BYTE_LENGTH;
    }
  }

