package hudson.model;

import hudson.tasks.BuildStep;

/**
 * Interface for {@link BuildStep}s that can be disabled.
 *
 * The default state for every BuildStep is being enabled, so the interface name is appropriate. This uses the positive
 * ("enabled") expression rather than the negative ("disabled") to prevent double negative expressions in code using it.
 */
public interface DisableableBuildStep extends BuildStep {

    void setEnabled(boolean enabled);

    boolean isEnabled();
}
