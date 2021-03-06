package cascading.legstar.cobolcopybook.beans.bean3.bind;

import cascading.legstar.cobolcopybook.beans.bean3.BdfoFileTrailer;
import cascading.legstar.cobolcopybook.beans.bean3.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * BdfoFileTrailer.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class BdfoFileTrailerBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 15;
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
   * Child bound to value object property BdfoFileTally(Integer).
   */
  public ICobolPackedDecimalBinding _bdfoFileTally;
  /**
   * Child bound to value object property BdfoFileHash(Integer).
   */
  public ICobolPackedDecimalBinding _bdfoFileHash;
  /**
   * Child bound to value object property BdfoNumAccountsSelected(Integer).
   */
  public ICobolPackedDecimalBinding _bdfoNumAccountsSelected;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private BdfoFileTrailer mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public BdfoFileTrailerBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public BdfoFileTrailerBinding( final BdfoFileTrailer valueObject )
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
  public BdfoFileTrailerBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final BdfoFileTrailer valueObject )
    {

    super( bindingName, fieldName, BdfoFileTrailer.class, null, parentBinding );
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

    _bdfoFileTally = BF.createPackedDecimalBinding( "BdfoFileTally", "BdfoFileTally", Integer.class, this );
    _bdfoFileTally.setCobolName( "BDFO-FILE-TALLY" );
    _bdfoFileTally.setByteLength( 5 );
    _bdfoFileTally.setTotalDigits( 9 );
    _bdfoFileTally.setIsSigned( true );
    _bdfoFileHash = BF.createPackedDecimalBinding( "BdfoFileHash", "BdfoFileHash", Integer.class, this );
    _bdfoFileHash.setCobolName( "BDFO-FILE-HASH" );
    _bdfoFileHash.setByteLength( 5 );
    _bdfoFileHash.setTotalDigits( 9 );
    _bdfoFileHash.setIsSigned( true );
    _bdfoNumAccountsSelected = BF.createPackedDecimalBinding( "BdfoNumAccountsSelected", "BdfoNumAccountsSelected", Integer.class, this );
    _bdfoNumAccountsSelected.setCobolName( "BDFO-NUM-ACCOUNTS-SELECTED" );
    _bdfoNumAccountsSelected.setByteLength( 5 );
    _bdfoNumAccountsSelected.setTotalDigits( 9 );
    _bdfoNumAccountsSelected.setIsSigned( true );

        /* Add children to children list */
    getChildrenList().add( _bdfoFileTally );
    getChildrenList().add( _bdfoFileHash );
    getChildrenList().add( _bdfoNumAccountsSelected );

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
    mValueObject = mValueObjectFactory.createBdfoFileTrailer();
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
        /* Get Value object property _bdfoFileTally */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_bdfoFileTally" + " value=" + mValueObject.getBdfoFileTally() );
      }
    _bdfoFileTally.setObjectValue( mValueObject.getBdfoFileTally() );
        /* Get Value object property _bdfoFileHash */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_bdfoFileHash" + " value=" + mValueObject.getBdfoFileHash() );
      }
    _bdfoFileHash.setObjectValue( mValueObject.getBdfoFileHash() );
        /* Get Value object property _bdfoNumAccountsSelected */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_bdfoNumAccountsSelected" + " value=" + mValueObject.getBdfoNumAccountsSelected() );
      }
    _bdfoNumAccountsSelected.setObjectValue( mValueObject.getBdfoNumAccountsSelected() );
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
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setBdfoFileTally( (Integer) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setBdfoFileHash( (Integer) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setBdfoNumAccountsSelected( (Integer) bindingValue );
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
    if( type.equals( BdfoFileTrailer.class ) )
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
    if( bindingValue.getClass().equals( BdfoFileTrailer.class ) )
      {
      mValueObject = (BdfoFileTrailer) bindingValue;
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
  public BdfoFileTrailer getBdfoFileTrailer()
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

