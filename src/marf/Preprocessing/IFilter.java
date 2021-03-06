package marf.Preprocessing;


/**
 * <p>An interface all filters must comply with.</p>
 *
 * @author Serguei Mokhov
 */
public interface IFilter
{
	/**
	 * Indicates 1-D filter.
	 * @since 0.3.0.6
	 */
	int FILTER_DIMENSIONALITY_1D = 2001;

	/**
	 * Indicates 2-D filter.
	 * @since 0.3.0.6
	 */
	int FILTER_DIMENSIONALITY_2D = 2002;

	/**
	 * Indicates 3-D filter.
	 * @since 0.3.0.6
	 */
	int FILTER_DIMENSIONALITY_3D = 2003;

	/**
	 * Applies filtering to the sample array and buffers
	 * the filtered data.
	 *
	 * @param padSample original sample to apply filtering to; should not be altered
	 * @param padFiltered buffer for filtered data
	 * @return <code>true<code> if filtering was successful and/or there were any changes
	 * @throws PreprocessingException if any error happened during filtering
	 */
	boolean filter(final double[] padSample, double[] padFiltered)
	throws PreprocessingException;

	/**
	 * Applies 2D filtering to the sample array and buffers
	 * the filtered data.
	 *
	 * @param padSample original sample to apply filtering to; should not be altered
	 * @param padFiltered buffer for filtered data
	 * @return <code>true<code> if filtering was successful and/or there were any changes
	 * @throws PreprocessingException if any error happened during filtering
	 *
	 * @since 0.3.0.6
	 */
	boolean filter(final double[][] padSample, double[][] padFiltered)
	throws PreprocessingException;

	/**
	 * Applies 3D filtering to the sample array and buffers
	 * the filtered data.
	 *
	 * @param padSample original sample to apply filtering to; should not be altered
	 * @param padFiltered buffer for filtered data
	 * @return <code>true<code> if filtering was successful and/or there were any changes
	 * @throws PreprocessingException if any error happened during filtering
	 *
	 * @since 0.3.0.6
	 */
	boolean filter(final double[][][] padSample, double[][][] padFiltered)
	throws PreprocessingException;
}

// EOF
