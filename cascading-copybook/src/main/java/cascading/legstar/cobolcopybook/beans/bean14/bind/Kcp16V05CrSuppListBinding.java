package cascading.legstar.cobolcopybook.beans.bean14.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.bean14.Kcp16V05CrSuppList;
import cascading.legstar.cobolcopybook.beans.bean14.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolArrayStringBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp16V05CrSuppList.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp16V05CrSuppListBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 11;
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
   * Child bound to value object property Kcp16V05SuppCrPrt(String).
   */
  public ICobolStringBinding _kcp16V05SuppCrPrt;
  /**
   * Child bound to value object property Kcp16V05NoOfCrTypes(Integer).
   */
  public ICobolZonedDecimalBinding _kcp16V05NoOfCrTypes;
  /**
   * Child bound to value object property Kcp16V05SuppListCrtypes(String).
   */
  public ICobolArrayStringBinding _kcp16V05SuppListCrtypes;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp16V05CrSuppList mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp16V05CrSuppListBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp16V05CrSuppListBinding( final Kcp16V05CrSuppList valueObject )
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
  public Kcp16V05CrSuppListBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp16V05CrSuppList valueObject )
    {

    super( bindingName, fieldName, Kcp16V05CrSuppList.class, null, parentBinding );
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

    _kcp16V05SuppCrPrt = BF.createStringBinding( "Kcp16V05SuppCrPrt", "Kcp16V05SuppCrPrt", String.class, this );
    _kcp16V05SuppCrPrt.setCobolName( "KCP16V05-SUPP-CR-PRT" );
    _kcp16V05SuppCrPrt.setByteLength( 1 );
    _kcp16V05NoOfCrTypes = BF.createZonedDecimalBinding( "Kcp16V05NoOfCrTypes", "Kcp16V05NoOfCrTypes", Integer.class, this );
    _kcp16V05NoOfCrTypes.setCobolName( "KCP16V05-NO-OF-CR-TYPES" );
    _kcp16V05NoOfCrTypes.setByteLength( 1 );
    _kcp16V05NoOfCrTypes.setTotalDigits( 1 );
    _kcp16V05SuppListCrtypes = BF.createArrayStringBinding( "Kcp16V05SuppListCrtypes", "Kcp16V05SuppListCrtypes", String.class, this );
    _kcp16V05SuppListCrtypes.setCobolName( "KCP16V05-SUPP-LIST-CRTYPES" );
    _kcp16V05SuppListCrtypes.setByteLength( 9 );
    _kcp16V05SuppListCrtypes.setItemByteLength( 1 );
    _kcp16V05SuppListCrtypes.setMinOccurs( 9 );
    _kcp16V05SuppListCrtypes.setMaxOccurs( 9 );

        /* Add children to children list */
    getChildrenList().add( _kcp16V05SuppCrPrt );
    getChildrenList().add( _kcp16V05NoOfCrTypes );
    getChildrenList().add( _kcp16V05SuppListCrtypes );

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
    mValueObject = mValueObjectFactory.createKcp16V05CrSuppList();
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
        /* Get Value object property _kcp16V05SuppCrPrt */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp16V05SuppCrPrt" + " value=" + mValueObject.getKcp16V05SuppCrPrt() );
      }
    _kcp16V05SuppCrPrt.setObjectValue( mValueObject.getKcp16V05SuppCrPrt() );
        /* Get Value object property _kcp16V05NoOfCrTypes */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp16V05NoOfCrTypes" + " value=" + mValueObject.getKcp16V05NoOfCrTypes() );
      }
    _kcp16V05NoOfCrTypes.setObjectValue( mValueObject.getKcp16V05NoOfCrTypes() );
        /* Get Value object property _kcp16V05SuppListCrtypes */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp16V05SuppListCrtypes" + " value=" + mValueObject.getKcp16V05SuppListCrtypes() );
      }
    _kcp16V05SuppListCrtypes.setObjectValue( mValueObject.getKcp16V05SuppListCrtypes() );
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
        mValueObject.setKcp16V05SuppCrPrt( (String) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp16V05NoOfCrTypes( (Integer) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( String.class );
        List<String> listKcp16V05SuppListCrtypes = cast( bindingValue );
        mValueObject.getKcp16V05SuppListCrtypes().clear();
        mValueObject.getKcp16V05SuppListCrtypes().addAll( listKcp16V05SuppListCrtypes );
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
    if( type.equals( Kcp16V05CrSuppList.class ) )
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
    if( bindingValue.getClass().equals( Kcp16V05CrSuppList.class ) )
      {
      mValueObject = (Kcp16V05CrSuppList) bindingValue;
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
  public Kcp16V05CrSuppList getKcp16V05CrSuppList()
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
