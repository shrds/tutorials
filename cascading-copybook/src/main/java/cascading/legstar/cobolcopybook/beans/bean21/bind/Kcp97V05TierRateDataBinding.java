package cascading.legstar.cobolcopybook.beans.bean21.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.bean21.Kcp97V05HistoricalRateData;
import cascading.legstar.cobolcopybook.beans.bean21.Kcp97V05TierRateData;
import cascading.legstar.cobolcopybook.beans.bean21.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolArrayComplexBinding;
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
 * Kcp97V05TierRateData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp97V05TierRateDataBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 137;
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
   * Child bound to value object property Kcp97V05RateTierNumber(Short).
   */
  public ICobolPackedDecimalBinding _kcp97V05RateTierNumber;
  /**
   * Child bound to value object property Kcp97V05XsRateChangeInd(String).
   */
  public ICobolStringBinding _kcp97V05XsRateChangeInd;
  /**
   * Child bound to value object property Kcp97V05NoOfChanges(Short).
   */
  public ICobolPackedDecimalBinding _kcp97V05NoOfChanges;
  /**
   * Child bound to value object property Kcp97V05HistoricalRateData(Kcp97V05HistoricalRateData).
   */
  public ICobolArrayComplexBinding _kcp97V05HistoricalRateDataWrapper;
  /**
   * Binding item for complex array binding Kcp97V05HistoricalRateData.
   */
  public ICobolComplexBinding _kcp97V05HistoricalRateDataWrapperItem;
  /**
   * Child bound to value object property Kcp97V05DefaultRateT006Key(String).
   */
  public ICobolStringBinding _kcp97V05DefaultRateT006Key;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp97V05TierRateData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp97V05TierRateDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp97V05TierRateDataBinding( final Kcp97V05TierRateData valueObject )
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
  public Kcp97V05TierRateDataBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp97V05TierRateData valueObject )
    {

    super( bindingName, fieldName, Kcp97V05TierRateData.class, null, parentBinding );
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

    _kcp97V05RateTierNumber = BF.createPackedDecimalBinding( "Kcp97V05RateTierNumber", "Kcp97V05RateTierNumber", Short.class, this );
    _kcp97V05RateTierNumber.setCobolName( "KCP97V05-RATE-TIER-NUMBER" );
    _kcp97V05RateTierNumber.setByteLength( 2 );
    _kcp97V05RateTierNumber.setTotalDigits( 3 );
    _kcp97V05RateTierNumber.setIsSigned( true );
    _kcp97V05XsRateChangeInd = BF.createStringBinding( "Kcp97V05XsRateChangeInd", "Kcp97V05XsRateChangeInd", String.class, this );
    _kcp97V05XsRateChangeInd.setCobolName( "KCP97V05-XS-RATE-CHANGE-IND" );
    _kcp97V05XsRateChangeInd.setByteLength( 1 );
    _kcp97V05NoOfChanges = BF.createPackedDecimalBinding( "Kcp97V05NoOfChanges", "Kcp97V05NoOfChanges", Short.class, this );
    _kcp97V05NoOfChanges.setCobolName( "KCP97V05-NO-OF-CHANGES" );
    _kcp97V05NoOfChanges.setByteLength( 2 );
    _kcp97V05NoOfChanges.setTotalDigits( 3 );
    _kcp97V05NoOfChanges.setIsSigned( true );
    _kcp97V05HistoricalRateDataWrapperItem = new Kcp97V05HistoricalRateDataBinding( "Kcp97V05HistoricalRateDataWrapperItem", "Kcp97V05HistoricalRateData", this, null );
    _kcp97V05HistoricalRateDataWrapper = new Kcp97V05HistoricalRateDataWrapperBinding( "Kcp97V05HistoricalRateDataWrapper", "Kcp97V05HistoricalRateData", this, _kcp97V05HistoricalRateDataWrapperItem );
    _kcp97V05HistoricalRateDataWrapper.setCobolName( "KCP97V05-HISTORICAL-RATE-DATA" );
    _kcp97V05HistoricalRateDataWrapper.setByteLength( 128 );
    _kcp97V05HistoricalRateDataWrapper.setItemByteLength( 32 );
    _kcp97V05HistoricalRateDataWrapper.setMinOccurs( 4 );
    _kcp97V05HistoricalRateDataWrapper.setMaxOccurs( 4 );
    _kcp97V05DefaultRateT006Key = BF.createStringBinding( "Kcp97V05DefaultRateT006Key", "Kcp97V05DefaultRateT006Key", String.class, this );
    _kcp97V05DefaultRateT006Key.setCobolName( "KCP97V05-DEFAULT-RATE-T006-KEY" );
    _kcp97V05DefaultRateT006Key.setByteLength( 4 );

        /* Add children to children list */
    getChildrenList().add( _kcp97V05RateTierNumber );
    getChildrenList().add( _kcp97V05XsRateChangeInd );
    getChildrenList().add( _kcp97V05NoOfChanges );
    getChildrenList().add( _kcp97V05HistoricalRateDataWrapper );
    getChildrenList().add( _kcp97V05DefaultRateT006Key );

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
    mValueObject = mValueObjectFactory.createKcp97V05TierRateData();
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
        /* Get Value object property _kcp97V05RateTierNumber */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp97V05RateTierNumber" + " value=" + mValueObject.getKcp97V05RateTierNumber() );
      }
    _kcp97V05RateTierNumber.setObjectValue( mValueObject.getKcp97V05RateTierNumber() );
        /* Get Value object property _kcp97V05XsRateChangeInd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp97V05XsRateChangeInd" + " value=" + mValueObject.getKcp97V05XsRateChangeInd() );
      }
    _kcp97V05XsRateChangeInd.setObjectValue( mValueObject.getKcp97V05XsRateChangeInd() );
        /* Get Value object property _kcp97V05NoOfChanges */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp97V05NoOfChanges" + " value=" + mValueObject.getKcp97V05NoOfChanges() );
      }
    _kcp97V05NoOfChanges.setObjectValue( mValueObject.getKcp97V05NoOfChanges() );
        /* Get Value object property _kcp97V05HistoricalRateDataWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp97V05HistoricalRateDataWrapper" + " value=" + mValueObject.getKcp97V05HistoricalRateData() );
      }
    _kcp97V05HistoricalRateDataWrapper.setObjectValue( mValueObject.getKcp97V05HistoricalRateData() );
        /* Get Value object property _kcp97V05DefaultRateT006Key */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp97V05DefaultRateT006Key" + " value=" + mValueObject.getKcp97V05DefaultRateT006Key() );
      }
    _kcp97V05DefaultRateT006Key.setObjectValue( mValueObject.getKcp97V05DefaultRateT006Key() );
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
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setKcp97V05RateTierNumber( (Short) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp97V05XsRateChangeInd( (String) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setKcp97V05NoOfChanges( (Short) bindingValue );
        break;
      case 3:
        bindingValue = child.getObjectValue( Kcp97V05HistoricalRateData.class );
        List<Kcp97V05HistoricalRateData> listKcp97V05HistoricalRateDataWrapper = cast( bindingValue );
        mValueObject.getKcp97V05HistoricalRateData().clear();
        mValueObject.getKcp97V05HistoricalRateData().addAll( listKcp97V05HistoricalRateDataWrapper );
        break;
      case 4:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp97V05DefaultRateT006Key( (String) bindingValue );
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
    if( type.equals( Kcp97V05TierRateData.class ) )
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
    if( bindingValue.getClass().equals( Kcp97V05TierRateData.class ) )
      {
      mValueObject = (Kcp97V05TierRateData) bindingValue;
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
  public Kcp97V05TierRateData getKcp97V05TierRateData()
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

