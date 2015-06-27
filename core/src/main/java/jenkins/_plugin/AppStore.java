package jenkins._plugin;

import hudson.Extension;
import hudson.PluginManager;
import hudson.model.Action;
import jenkins.model.TransientActionFactory;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;

@Extension
public class AppStore implements Action {

    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @Override
    public String getDisplayName() {
        return "Plugin Store";
    }

    @Override
    public String getUrlName() {
        return "store";
    }

    @Extension(ordinal = 1)
    public static class AppStoreActionFactory extends TransientActionFactory<PluginManager> {

        @Override
        public Class<PluginManager> type() {
            return PluginManager.class;
        }

        @Nonnull
        @Override
        public Collection<? extends Action> createFor(@Nonnull PluginManager target) {
            Collection<Action> actions = new ArrayList<Action>();
            actions.add(new AppStore());
            return actions;
        }
    }
}
